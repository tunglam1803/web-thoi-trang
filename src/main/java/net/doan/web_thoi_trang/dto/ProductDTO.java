package net.doan.web_thoi_trang.dto;

import jakarta.validation.constraints.*;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class ProductDTO {
    private Long id;
    @NotBlank(message = "Tên sản phẩm không được để trống")
    @Size(max = 255, message = "Tên sản phẩm không được dài quá 255 ký tự")
    private String productName;

    @NotNull(message = "Giá sản phẩm không được để trống")
    @Positive(message = "Giá sản phẩm phải lớn hơn 0")
    private Double price;

    @PositiveOrZero(message = "Giá khuyến mãi phải >= 0")
    private Double promotionalPrice;
  //  private String photo;
    private MultipartFile photo;

    @Size(max = 10000, message = "Mô tả sản phẩm không được dài quá 10000 ký tự")
    private String describe;

    @NotNull(message = "Danh mục không được để trống")
    private Long categoryId; 

    @NotBlank(message = "Thương hiệu không được để trống")
    private String brand;

    @NotNull(message = "Số lượng sản phẩm không được để trống")
    @Min(value = 0, message = "Số lượng không thể nhỏ hơn 0")
    private Integer stock;

    @NotBlank(message = "Kích thước không được để trống")
    private String size;

    @NotBlank(message = "Chất liệu không được để trống")
    private String material;

    @DecimalMin(value = "0.0", message = "Đánh giá không thể nhỏ hơn 0")
    @DecimalMax(value = "5.0", message = "Đánh giá không thể lớn hơn 5")
    private Double rating;

    @Min(value = 0, message = "Số lượng đánh giá không thể nhỏ hơn 0")
    private Integer reviewCount;
}
