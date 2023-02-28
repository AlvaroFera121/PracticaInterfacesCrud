package PracticaInterfaces.demo.Controlador;


import PracticaInterfaces.demo.prodcutoService;
import PracticaInterfaces.demo.Model.productos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class controlador {

    @Autowired
    public prodcutoService pr;


    @GetMapping("/listar")
    public String listar(Model m){
        List<productos>productos=pr.listar();
        m.addAttribute("producto",productos);
        return "index";
    }

    @GetMapping("/nuevo")
    public String agregar(Model m){
        m.addAttribute("producto",new productos());
        return "Anadir";
    }

   @PostMapping("/guardar")
    public String guardar(productos ppp,Model m){
        int i = pr.save(ppp);
        return "redirect:/listar";
    }

    @PostMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model mo){
        Optional<productos>prod=pr.listarId(id);
        mo.addAttribute("producto",prod);
        return "Anadir";
    }
    @GetMapping("/eliminar/{id}")
    public String eliminar(Model m, @PathVariable int id){
    pr.delete(id);
        return "redirect:/listar";
    }

}
