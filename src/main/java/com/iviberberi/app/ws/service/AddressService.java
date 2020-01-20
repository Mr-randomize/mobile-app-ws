package com.iviberberi.app.ws.service;

import com.iviberberi.app.ws.shared.dto.AddressDto;

import java.util.List;

public interface AddressService {
    List<AddressDto> getAddresses(String userId);

    AddressDto getAddress(String addressId);
}
