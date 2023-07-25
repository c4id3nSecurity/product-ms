package br.com.xorin.productms.service;

import br.com.xorin.productms.dto.ProductDTO;

import java.util.List;
import java.util.Optional;

public interface ProductService {

  Optional<ProductDTO> create(ProductDTO request);

  List<ProductDTO> getAll();

  Optional<ProductDTO> getById(Long id);

  Optional<ProductDTO> update(Long id, ProductDTO request);

  boolean inactive(Long id);
}
