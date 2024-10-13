package az.edu.shopping.shoppingapp.domain.entity;

import az.edu.shopping.shoppingapp.enums.VerificationStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity(name = "applicationUsers")
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private LocalDate birthday;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private Boolean isActive;

    @Column(nullable = false)
    private int failedLoginAttempts;

    private LocalDate lastLoginDate;

    @Column(updatable = false)
    private LocalDate createdDate;

    private LocalDate updatedDate;

    private String profileImageUrl;

    @Enumerated(EnumType.STRING)
    private VerificationStatus isEmailVerified=VerificationStatus.VERIFIED;

    @Enumerated(EnumType.STRING)
    private VerificationStatus isPhoneVerified=VerificationStatus.VERIFIED;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<AddressEntity> address;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OrderEntity> orders;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ReviewEntity> reviews;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private BasketEntity cart;


}
