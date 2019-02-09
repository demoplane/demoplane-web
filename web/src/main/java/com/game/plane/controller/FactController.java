package com.game.plane.controller;

import com.game.plane.dto.CommonResponse;
import com.game.plane.entity.Fact;
import com.game.plane.enums.ReturnCode;
import com.game.plane.service.FactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/fact")
public class FactController {

    @Autowired
    private FactService factService;

    @PostMapping()
    public CommonResponse registerFact(@RequestBody Fact fact) {
        CommonResponse response = new CommonResponse();

        try {
            response.setReturnCode(ReturnCode.SUCCESS.getReturnCode());
            response.setReturnCode(ReturnCode.SUCCESS.getReturnMessage());
            factService.insert(fact);
        } catch(Exception ex) {
            response.setReturnCode(ReturnCode.DB_FAIL.getReturnCode());
            response.setReturnCode(ReturnCode.DB_FAIL.getReturnMessage());
        }

        return response;
    }
}
