package com.ad.swagger.admire.controller;

import com.ad.swagger.admire.model.Employee;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdmireController {

    @PostMapping(value =  "/employee", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE) // defines the type the service must accept and produce
    @Tag(name = "Employee details", description = "Employee related information") // to group related endpoints or operations under a common category.
    @Operation(description = "Employee sample API") //  to define a single operation or endpoint in an API.
    @ApiResponses( value = {
            @ApiResponse(responseCode = "200", description = "Employee successfully saved"),
            @ApiResponse(responseCode = "404", description = "Employee Not Found", content = @Content)
    }) // to specify the possible responses that an API operation can return
    public Employee saveEmployee(@RequestBody Employee employee) { // save employee method

        return employee;
    }

    @GetMapping(value = "/employee/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @Tag(name = "Employee details", description = "Employee related information")
    @Operation(description = "Get employee details")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Employee found"),
            @ApiResponse(responseCode = "404", description = "Employee Not Found", content = @Content)
    })
    public Employee getEmployee(@PathVariable(value = "23", required = true) Integer id){

        return new Employee();
    }

    @GetMapping(value = "/manager", produces = MediaType.APPLICATION_JSON_VALUE)
    @Tag(name = "Manager details", description = "Manager related information")
    @Operation(description = "Get manager details")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Manager found"),
            @ApiResponse(responseCode = "404", description = "Manager Not Found", content = @Content)
    })
    public String getManager() {
        return "Manager available";
    }


}