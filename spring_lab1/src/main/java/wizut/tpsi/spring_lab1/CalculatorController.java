/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wizut.tpsi.spring_lab1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author dm41347
 */
@Controller
public class CalculatorController { 
    @RequestMapping("/result")
    public String result(Model model, CalculatorForm rownanie){
        Integer x = rownanie.getX();
        Integer y = rownanie.getY();
        switch(rownanie.getOperacja())
        {
            case "+": rownanie.setOperacja("+"); model.addAttribute("wynik", x+y); break;
            case "-": rownanie.setOperacja("-"); model.addAttribute("wynik", x-y); break;
            case "*": rownanie.setOperacja("*"); model.addAttribute("wynik", x*y); break;
        }
        model.addAttribute("x", x);
        model.addAttribute("operacja", rownanie.getOperacja());
        model.addAttribute("y", y);
        
        return "result";
    }
    
}
