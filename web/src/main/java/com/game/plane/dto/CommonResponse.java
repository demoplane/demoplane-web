package com.game.plane.dto;

import com.game.plane.enums.ReturnCode;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommonResponse<T> {
    private String returnCode;
    private String returnMessage;
    private T info;

    public CommonResponse(ReturnCode returnCode) {
        this.returnCode = returnCode.getReturnCode();
        this.returnMessage = returnCode.getReturnMessage();
    }
}
