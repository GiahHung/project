package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.*;

import com.example.database.AddProductDAO;
import com.example.ui.addProduct.AddPresenter;
import com.example.usecase.createProduct.AddInputBoundary;
import com.example.usecase.createProduct.AddInputDTO;
import com.example.usecase.createProduct.AddOutputDTO;
import com.example.usecase.createProduct.AddUseCase;
import com.example.usecase.createProduct.ResponeData;

public class AddTest {

    @Test
    public void testAddProduct() {

        AddPresenter presenter = new AddPresenter();

        AddProductDAO data = new AddProductDAO();

        AddInputBoundary addInputBoundary = new AddUseCase(data, presenter);
        Calendar cal1 = Calendar.getInstance();
        cal1.set(2024, Calendar.JULY, 7);
        Date date1 = cal1.getTime();

        Calendar cal2 = Calendar.getInstance();
        cal2.set(2024, Calendar.DECEMBER, 8);
        Date date2 = cal2.getTime();

        AddInputDTO addInputDTO3 = new AddInputDTO(0, "TV Samsung", 25000000, "electronic", 10, "cai", 0,0);
        //AddInputDTO addInputDTO2 = new AddInputDTO(0, "Chậu", 100000, "ceramic", 20, "cai",  "xxxxxx",date1 );
        //AddInputDTO addInputDTO = new AddInputDTO(0, "Sốt majone", 100000, "food", 100, "cai",  date1, date2, "xxxxxx");

        addInputBoundary.execute(addInputDTO3);
 
        //AddOutputDTO addOutputDTO = presenter.geOutputDTO();
        //assertEquals(addInputDTO3.getName(), addOutputDTO.getName());

        
       
        ResponeData res = presenter.getResponeData();
        assertEquals("Thông tin không hợp lệ", res.getMessage());
        
    }
}
