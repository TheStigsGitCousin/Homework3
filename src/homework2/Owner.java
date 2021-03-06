/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;

import homework2.bank.Account;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author David
 */
public interface Owner extends Remote {
    public String getName() throws RemoteException;
    public Account getBankAccount() throws RemoteException;
    
    public void itemSold(Item item) throws RemoteException;
    public void wishAvaible(Item item) throws RemoteException;
}
