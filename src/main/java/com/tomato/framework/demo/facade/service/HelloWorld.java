package com.tomato.framework.demo.facade.service;

import com.tomato.framework.demo.facade.dto.PostDemo;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloWorld extends Remote {
    
    String hello(String hello) throws RemoteException;
    
    PostDemo post(PostDemo postDemo) throws RemoteException;
}
