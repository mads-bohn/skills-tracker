package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping("/")
    public static String createList() {
        return "<html>" +
                "<body>\n" +
                "    <h1>Skills Tracker</h1>\n" +
                "    <h2>My Favorite Languages</h2>\n" +
                "    <ol>\n" +
                "        <li>Java</li>\n" +
                "        <li>JavaScript</li>\n" +
                "        <li>HTML</li>\n" +
                "    </ol>\n" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public static String createForm() {
        return "<html>" +
                "<body>\n" +
                "    <form action='form' method='post'>\n" +
                "       <label for=\"username\">Name:</label>\n" +
                "        <input type=\"text\" name=\"username\" id=\"username\">" +
                "        <label for=\"firstfav\">First favorite language:</label>\n" +
                "        <select name=\"firstfav\" id=\"firstfav\">\n" +
                "            <option value=\"java\">Java</option>\n" +
                "            <option value=\"js\">Javascript</option>\n" +
                "            <option value=\"html\">HTML</option>\n" +
                "            <option value=\"ruby\">Ruby</option>\n" +
                "            <option value=\"python\">Python</option>\n" +
                "        </select>\n" +
                "<br/>" +
                "        <label for=\"secondfav\">Second favorite language:</label>\n" +
                "        <select name=\"secondfav\" id=\"secondfav\">\n" +
                "            <option value=\"java\">Java</option>\n" +
                "            <option value=\"js\">Javascript</option>\n" +
                "            <option value=\"html\">HTML</option>\n" +
                "            <option value=\"ruby\">Ruby</option>\n" +
                "            <option value=\"python\">Python</option>\n" +
                "        </select>\n" +
                "<br/>" +
                "        <label for=\"thirdfav\">Third favorite language:</label>\n" +
                "        <select name=\"thirdfav\" id=\"thirdfav\">\n" +
                "            <option value=\"java\">Java</option>\n" +
                "            <option value=\"js\">Javascript</option>\n" +
                "            <option value=\"html\">HTML</option>\n" +
                "            <option value=\"ruby\">Ruby</option>\n" +
                "            <option value=\"python\">Python</option>\n" +
                "        </select>\n" +
                "<input type=\"submit\">" +
                "    </form>\n" +
                "</body>" +
                "</html>";
    }
}
