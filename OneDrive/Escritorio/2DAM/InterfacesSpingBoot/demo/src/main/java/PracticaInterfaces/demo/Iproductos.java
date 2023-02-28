package PracticaInterfaces.demo;

import PracticaInterfaces.demo.Model.productos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface Iproductos extends CrudRepository<productos, Integer> { }
