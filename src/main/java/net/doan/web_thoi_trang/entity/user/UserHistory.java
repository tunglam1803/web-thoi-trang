package net.doan.web_thoi_trang.entity.user;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@Table(name = "user_history")
public class UserHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

//    tên của action tạo mới hay chỉnh sửa v.v
    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "created_by")
    private Integer createdBy;

    @Column(name = "created_date")
    private Integer createdDate;
}
