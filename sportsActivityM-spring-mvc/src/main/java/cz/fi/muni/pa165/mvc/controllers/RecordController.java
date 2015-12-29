package cz.fi.muni.pa165.mvc.controllers;

import cz.muni.fi.pa165.sportsactivitymanager.Dto.UserDTO;
import cz.muni.fi.pa165.sportsactivitymanager.Enums.UserState;
import cz.muni.fi.pa165.sportsactivitymanager.Facade.ActivityRecordFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by michal on 12/26/15.
 */
@Controller
@RequestMapping("/record")
public class RecordController {

    @Autowired
    private ActivityRecordFacade recordFacade;

    /* TODO: autowiring recordFacade might not work - check persistence
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        recordFacade.getAllRecords();
        model.addAttribute("records", recordFacade.getAllRecords());
        return "record/list";
    }

    */

    /* TODO: make some filter maybe

    @RequestMapping(value = "/list/{filter}", method = RequestMethod.GET)
    public String list(@PathVariable String filter, Model model) {
        List<UserDTO> users;
        switch (filter) {
            case "all":
                users = recordFacade.getAllUsers();
                break;
            case "customers":
                users = recordFacade.getUsersByState(UserState.CUSTOMER);
                break;
            case "admins":
                users = recordFacade.getUsersByState(UserState.ADMIN);
                break;
            case "inactive":
                users = recordFacade.getUsersByState(UserState.INACTIVE);
                break;
            default:
                users = new ArrayList<>();
                model.addAttribute("alert_danger", "Unknown filter " + filter);

        }
        model.addAttribute("users", users);
        return "user/list";
    }
    */
}
