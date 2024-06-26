package com.example.demo.business;

import com.example.demo.Interface.IProductBL;
import com.example.demo.dto.ProductoDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ProductoBL implements IProductBL {
    @Override
    public Object getProducto(int idProducto) {


        ProductoDto miProducto = new ProductoDto();

        miProducto.setCodigo(123);
        miProducto.setDescripcion("Producto de ejemplo");
        miProducto.setPrecio(99.99);

        return miProducto;
    }

    public List<ProductoDto> getProductos()
    {
        List<ProductoDto> listaProductos = new ArrayList<>();

        // Crear instancias de ProductoDto y agregarlas a la lista
        ProductoDto producto1 = new ProductoDto();
        producto1.setCodigo(1);
        producto1.setDescripcion("Ácido Hialurónico");
        producto1.setPrecio(104000.2);
        producto1.setRutaImage("./assets/img/portfolio/acido.webp");
        listaProductos.add(producto1);

        ProductoDto producto2 = new ProductoDto();
        producto2.setCodigo(2);
        producto2.setDescripcion("Mascarilla Facial");
        producto2.setPrecio(75000.0);
        producto2.setRutaImage("./assets/img/portfolio/mascarillas.webp");
        listaProductos.add(producto2);

        ProductoDto producto3 = new ProductoDto();
        producto3.setCodigo(3);
        producto3.setDescripcion("Vitamina B");
        producto3.setPrecio(25000.0);
        producto3.setRutaImage("./assets/img/portfolio/vitaminb.webp");
        listaProductos.add(producto3);

        ProductoDto producto4 = new ProductoDto();
        producto4.setCodigo(4);
        producto4.setDescripcion("Tónico Facial");
        producto4.setPrecio(65000.0);
        producto4.setRutaImage("./assets/img/portfolio/tonicfacial.png");
        listaProductos.add(producto4);

        ProductoDto producto5 = new ProductoDto();
        producto5.setCodigo(5);
        producto5.setDescripcion("Aclarador Facial");
        producto5.setPrecio(41000.0);
        producto5.setRutaImage("./assets/img/portfolio/aclarador.png");
        listaProductos.add(producto5);

        ProductoDto producto6 = new ProductoDto();
        producto6.setCodigo(6);
        producto6.setDescripcion("Mascarilla Facial");
        producto6.setPrecio(30000.0);
        producto6.setRutaImage("./assets/img/portfolio/tonicfacial.png");
        listaProductos.add(producto6);

        ProductoDto producto7 = new ProductoDto();
        producto7.setCodigo(7);
        producto7.setDescripcion("Agua Micelar");
        producto7.setPrecio(42000.0);
        producto7.setRutaImage("./assets/img/portfolio/micelar.webp");
        listaProductos.add(producto7);

        ProductoDto producto8 = new ProductoDto();
        producto8.setCodigo(8);
        producto8.setDescripcion("Protector Solar");
        producto8.setPrecio(90000.0);
        producto8.setRutaImage("./assets/img/portfolio/protector.jpg");
        listaProductos.add(producto8);

        ProductoDto producto9 = new ProductoDto();
        producto9.setCodigo(9);
        producto9.setDescripcion("Crema Corporal");
        producto9.setPrecio(70000.0);
        producto9.setRutaImage("./assets/img/portfolio/corporal.png");
        listaProductos.add(producto9);

        return listaProductos;
    }
}
