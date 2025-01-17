package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.example.database.DeleteProductDAO;
import com.example.ui.deleteProduct.DeleteProductPresenter;
import com.example.usecase.deleteProduct.DeleteInputDTO;
import com.example.usecase.deleteProduct.DeleteUsecase;

import java.util.*;
public class DeleteTest {
       @Test
       public void DeleteTest() {
          DeleteProductDAO deleteProductDAO = new DeleteProductDAO();
          DeleteProductPresenter deleteProductPresenter = new DeleteProductPresenter();
          DeleteUsecase deleteUsecase = new DeleteUsecase(deleteProductPresenter, deleteProductDAO);

          DeleteInputDTO deleteInputDTO = new DeleteInputDTO(79);

          deleteUsecase.execute(deleteInputDTO);

         assertEquals("Xóa thành công", deleteProductPresenter.getOutputDTO().getMessage());

 }
}
