package com.feyyazbegen.microservices.currencyconversionservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "currency-exchange",url = "localhost:8000")
public interface CurrencyExchangeProxy {

    CurrencyConversion retrieveExchangeValue(@PathVariable String from,@PathVariable String to);
}
