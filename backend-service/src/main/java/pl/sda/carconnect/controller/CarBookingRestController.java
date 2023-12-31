package pl.sda.carconnect.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.carconnect.dto.CarBookingDto;
import pl.sda.carconnect.dto.CarBookingRequestDto;
import pl.sda.carconnect.service.CarBookingService;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping(path = "/api/car-booking")
public class CarBookingRestController {
    private final CarBookingService bookingService;

    @PostMapping("/car-bookings")
    public CarBookingDto bookCar(@RequestBody CarBookingRequestDto bookingDto) {
        log.info("Car booking request: [{}]", bookingDto);
        bookingService.bookCar(bookingDto);

        return null;
    }
}
