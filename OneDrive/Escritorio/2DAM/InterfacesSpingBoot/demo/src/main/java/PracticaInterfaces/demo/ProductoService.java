package PracticaInterfaces.demo;

import PracticaInterfaces.demo.Model.productos;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface ProductoService {
    public List<productos> listar();
    public int save(productos p);
    public void delete(int id);
    public Optional<productos>listarId(int id);

}
