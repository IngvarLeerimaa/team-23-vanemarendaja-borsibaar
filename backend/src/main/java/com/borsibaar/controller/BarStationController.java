package com.borsibaar.controller;

import com.borsibaar.dto.BarStationRequestDto;
import com.borsibaar.dto.BarStationResponseDto;
import com.borsibaar.entity.User;
import com.borsibaar.service.BarStationService;
import com.borsibaar.util.SecurityUtils;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bar-stations")
@RequiredArgsConstructor
public class BarStationController {

    private final BarStationService barStationService;

    /**
     * Helper method to get the current user and ensure they are an admin.
     * Reduces repeated admin checks in controller methods.
     */
    private User getAdminUser() {
        User user = SecurityUtils.getCurrentUser();
        SecurityUtils.requireAdminRole(user);
        return user;
    }

    @GetMapping
    public List<BarStationResponseDto> getAllStations() {
        User user = getAdminUser(); // only admins can access
        return barStationService.getAllStations(user.getOrganizationId());
    }

    @GetMapping("/user")
    public List<BarStationResponseDto> getUserStations() {
        User user = SecurityUtils.getCurrentUser(); // no admin check here
        return barStationService.getUserStations(user.getId(), user.getOrganizationId());
    }

    @GetMapping("/{id}")
    public BarStationResponseDto getStationById(@PathVariable Long id) {
        User user = SecurityUtils.getCurrentUser(); // no admin check here
        return barStationService.getStationById(user.getOrganizationId(), id);
    }

    @PostMapping
    public ResponseEntity<BarStationResponseDto> createStation(@Valid @RequestBody BarStationRequestDto request) {
        User user = getAdminUser(); // only admins can create
        BarStationResponseDto station = barStationService.createStation(user.getOrganizationId(), request);
        return ResponseEntity.status(HttpStatus.CREATED).body(station);
    }

    @PutMapping("/{id}")
    public BarStationResponseDto updateStation(
            @PathVariable Long id,
            @Valid @RequestBody BarStationRequestDto request) {
        User user = getAdminUser(); // only admins can update
        return barStationService.updateStation(user.getOrganizationId(), id, request);
    }

    @DeleteMapping("/{id}")
    public void deleteStation(@PathVariable Long id) {
        User user = getAdminUser(); // only admins can delete
        barStationService.deleteStation(user.getOrganizationId(), id);
    }
}
