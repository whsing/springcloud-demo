package com.hsing.webdemo.config;

import com.netflix.discovery.converters.Auto;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.Server;

import java.util.List;

public class TestRule implements IRule {

    private ILoadBalancer loadBalancer;

    @Override
    public Server choose(Object o) {
        List<Server> servers = loadBalancer.getAllServers();
        return servers.stream().filter(s -> 8803 == s.getPort()).findFirst().get();
    }

    @Override
    public void setLoadBalancer(ILoadBalancer iLoadBalancer) {
        this.loadBalancer = iLoadBalancer;
    }

    @Override
    public ILoadBalancer getLoadBalancer() {
        return this.loadBalancer;
    }
}
