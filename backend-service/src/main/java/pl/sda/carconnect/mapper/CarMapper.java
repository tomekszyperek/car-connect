package pl.sda.carconnect.mapper;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pl.sda.carconnect.domain.Car;
import pl.sda.carconnect.dto.CarDto;

@Component
@RequiredArgsConstructor
public class CarMapper implements IMapper<Car, CarDto> {
    private final PicturesMapper picturesMapper;

    @Override
    public CarDto fromEntityToDto(Car entity) {
        return CarDto.builder()
                .id(entity.getId())
                .fuelType(entity.getFuelType())
                .brand(entity.getBrand())
                .engineType(entity.getEngineType())
                .model(entity.getModel())
                .bodyType(entity.getBodyType())
                .numberOfSeats(entity.getNumberOfSeats())
                .trunkCapacityInLitres(entity.getTrunkCapacityInLitres())
                .averageConsumptionPer100Km(entity.getAverageConsumptionPer100Km())
                .bodySerialNumber(entity.getBodySerialNumber())
                .pricePerDayInPolishGrosz(entity.getPricePerDayInPolishGrosz())
                .available(entity.isAvailable())
                .rangeInKilometers(entity.getRangeInKilometers())
                .pictures(picturesMapper.fromEntityToDto(entity.getPictures()))
                .build();
    }

    @Override
    public Car fromDtoToEntity(CarDto dto) {
        return Car.builder()
                .id(dto.id())
                .model(dto.model())
                .brand(dto.brand())
                .fuelType(dto.fuelType())
                .engineType(dto.engineType())
                .bodyType(dto.bodyType())
                .numberOfSeats(dto.numberOfSeats())
                .trunkCapacityInLitres(dto.trunkCapacityInLitres())
                .averageConsumptionPer100Km(dto.averageConsumptionPer100Km())
                .bodySerialNumber(dto.bodySerialNumber())
                .pricePerDayInPolishGrosz(dto.pricePerDayInPolishGrosz())
                .available(dto.available())
                .rangeInKilometers(dto.rangeInKilometers())
                .pictures(picturesMapper.fromDtoToEntity(dto.pictures()))
                .build();
    }
}
