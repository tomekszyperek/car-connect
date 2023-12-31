package pl.sda.carconnect.dto;

import lombok.Builder;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Builder
public record ClientDto(
        Long id,
        String name,
        String surname,
        String pesel,
        String email,
        LocalDate dateOfBirth,
        LocalDateTime dateOfAccountCreated,
        String phoneNumber,
        AddressDto address
) {
}
