package org.example.it.consumer;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class HRRestConsumer {

    @Autowired
    private DiscoveryClient discoveryClient;

    public boolean isHoliday(String date) {
        List<ServiceInstance> instances = discoveryClient.getInstances("HR");
        if (instances.isEmpty()) {
            return false;
        }

        ServiceInstance instance = instances.get(0);
        String url = instance.getUri() + "/hr/isHoliday?date=" + date;
        RestTemplate restTemplate = new RestTemplate();
        Boolean result = restTemplate.getForObject(url, Boolean.class);
        return Boolean.TRUE.equals(result);
    }
}
