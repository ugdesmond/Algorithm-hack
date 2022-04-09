package Test;

public class Azenia {
    public static void main(String [] args){
        String s1="javatpoint is a very good website";
        String replaceString=s1.replaceAll("java","des").replaceAll("very","test");//replaces all occurrences of "a" to "e"
        System.out.println(replaceString);
        System.out.println("Hello world example");
    }
//    package com.codility.external;
//
//import org.springframework.stereotype.Service;
//import reactor.core.publisher.Flux;
//import reactor.core.publisher.Mono;
//
//    @Service
//    public class CarService {
//
//        private final CarRepository carRepository;
//        private final ApplicationEventPublisher publisher;
//
//        public CarService(CarRepository carRepository) {
//            this.carRepository = carRepository;
//            this.publisher = publisher;
//        }
//
//        public Flux<Car> findAll() {
//            return carRepository.findAll();
//        }
//
//        public Mono<Car> findById(String id) {
//            return carRepository.findById(id);
//        }
//
//        public Mono<Car> create(String name) {
//            return this.carRepository
//                    .save(new Car(null, name))
//                    .doOnSuccess(car -> this.publisher.publishEvent(car));
//        }
//
//
//        public Mono<Car> update(String id, String name) {
//            return this.carRepository
//                    .findById(id)
//                    .map(c-> new Car(c.getId(), name))
//                    .flatMap(carRepository::save);
//        }
//
//        public Mono<Car> delete(String id) {
//            return this.carRepository
//                    .findById(id)
//                    .flatMap(c -> carRepository.deleteById(c.getId()).thenReturn(c));
//        }
//    }
//
//package com.codility.external;
//
//import org.reactivestreams.Publisher;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import reactor.core.publisher.Mono;
//
//import java.net.URI;
//    @RestController
//    @RequestMapping(value="/car",produces = MediaType.APPLICATION_JSON_VALUE)
//    public class CarController {
//
//        private final MediaType mediaType = MediaType.APPLICATION_JSON;
//        private final CarService carService;
//
//        public CarController(CarService carService) {
//            this.carService = carService;
//
//        }
//        @GetMapping
//        Publisher<Car> findAll() {
//            return carService.findAll();
//
//        }
//        @GetMapping("/{id}")
//        Publisher<Car> findById(@PathVariable("id") String id) {
//            return carService.findById(id);
//
//        }
//
//
//        @PostMapping
//        Publisher<ResponseEntity<Car>> create(@RequestBody Car car) {
//
//            return this.carService
//                    .create(car.getName())
//                    .map(c -> ResponseEntity.created(URI.create("/car/" + c.getId()))
//                            .contentType(this.mediaType)
//                            .build());
//        }
//        @DeleteMapping("/{id}")
//        Publisher<Car> deleteById(@PathVariable String id) {
//            return this.carService.delete(id);
//
//        }
//        @PutMapping("/{id}")
//        Publisher<ResponseEntity<Car>> updateById(@PathVariable String id,
//                                                  @RequestBody Car car) {
//            return Mono
//                    .just(car)
//                    .flatMap(c -> carService.update(id,c.getName()))
//                    .map(c -> ResponseEntity
//                            .ok()
//                            .contentType(this.mediaType)
//                            .build());
//        }
//    }

}
