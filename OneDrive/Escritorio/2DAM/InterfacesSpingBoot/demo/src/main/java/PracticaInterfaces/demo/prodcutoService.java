package PracticaInterfaces.demo;

import PracticaInterfaces.demo.Model.productos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Component
public class prodcutoService implements ProductoService {

    @Autowired
    private Iproductos data;

    @Override
    public List<productos> listar() {
        return ( List<productos>)data.findAll();
    }

    @Override
    public int save(productos p) {
        int respuesta = 0;
        productos per = data.save(p);
        if(!per.equals(null)){
            respuesta = 1;
        }
        return 0;
    }

    @Override
    public void delete(int id) {
        data.deleteById(id);
    }

    @Override
    public Optional<productos> listarId(int id) {
        return data.findById(id);
    }
}
