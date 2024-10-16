package az.edu.shopping.shoppingapp.model.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class UserRequest {

    private String email;

    private String username;

    private String profileImageUrl;
}
