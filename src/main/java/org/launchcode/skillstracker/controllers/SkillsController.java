package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
    public static String createList(@RequestParam String username, @RequestParam String firstfav, @RequestParam String secondfav, @RequestParam String thirdfav) {
        return "<html>" +
                "<body>\n" +
                "    <h1>Skills Tracker</h1>\n" +
                "    <h2>" + username + "'s Favorite Languages</h2>\n" +
                "    <ol>\n" +
                "        <li>" +firstfav+ "</li>\n" +
                "        <li>" +secondfav+ "</li>\n" +
                "        <li>" +thirdfav+ "</li>\n" +
                "    </ol>\n" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public static String createForm() {
        return "<html>" +
                "<body>\n" +
                "    <form action='/' method='post'>\n" +
                "       <label for=\"username\">Name:</label>\n" +
                "        <input type=\"text\" name=\"username\" id=\"username\">" +
                "<br/>" +
                "        <label for=\"firstfav\">First favorite language:</label>\n" +
                "        <select name=\"firstfav\" id=\"firstfav\">\n" +
                "            <option value=\"Java\">Java</option>\n" +
                "            <option value=\"Javascript\">Javascript</option>\n" +
                "            <option value=\"HTML\">HTML</option>\n" +
                "            <option value=\"Ruby\">Ruby</option>\n" +
                "            <option value=\"Python\">Python</option>\n" +
                "        </select>\n" +
                "<br/>" +
                "        <label for=\"secondfav\">Second favorite language:</label>\n" +
                "        <select name=\"secondfav\" id=\"secondfav\">\n" +
                "            <option value=\"Java\">Java</option>\n" +
                "            <option value=\"Javascript\">Javascript</option>\n" +
                "            <option value=\"HTML\">HTML</option>\n" +
                "            <option value=\"Ruby\">Ruby</option>\n" +
                "            <option value=\"Python\">Python</option>\n" +
                "        </select>\n" +
                "<br/>" +
                "        <label for=\"thirdfav\">Third favorite language:</label>\n" +
                "        <select name=\"thirdfav\" id=\"thirdfav\">\n" +
                "            <option value=\"Java\">Java</option>\n" +
                "            <option value=\"Javascript\">Javascript</option>\n" +
                "            <option value=\"HTML\">HTML</option>\n" +
                "            <option value=\"Ruby\">Ruby</option>\n" +
                "            <option value=\"Python\">Python</option>\n" +
                "        </select>\n" +
                "<br/>" +
                "<input type=\"submit\">" +
                "    </form>\n" +
                "</body>" +
                "</html>";
    }
}
