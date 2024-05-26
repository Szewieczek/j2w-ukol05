package cz.czechitas.java2webapps.ukol5.controller;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Kontroler obsluhující registraci účastníků dětského tábora.
 */
@Controller
@RequestMapping("/")
public class RegistraceController {

    @GetMapping("/")
    public Object index() {
        ModelAndView modelAndView = new ModelAndView("/formular");
        modelAndView.addObject("form", new RegistraceForm());
        return modelAndView;
    }

    @PostMapping("/")
    public Object prihlaska(@Valid @ModelAttribute("form") RegistraceForm form, BindingResult bindingResult) {

        if (form.getVek() < 9 || form.getVek() > 15) {
            bindingResult.rejectValue("datumNarozeni", null, "Věk účastníka musí být mezi 9 a 15 lety.");
            return "formular";
        }

        if (bindingResult.hasErrors()) {
            return "/formular";
        }

        return new ModelAndView("/zaregistrovano")
                .addObject("jmeno", form.getJmeno())
                .addObject("prijmeni", form.getPrijmeni())
                .addObject("datumNarozeni", form.getDatumNarozeni())
                .addObject("pohlavi", form.getPohlavi())
                .addObject("turnus", form.getTurnus())
                .addObject("email", form.getEmail())
                .addObject("telefon", form.getTelefon());
    }
}
