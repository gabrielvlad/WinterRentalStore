package model;


import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;

public class ModelManager implements Model {

    private CustomerList customerList;
    private ItemList itemList;

    private EmployeeList employeeList;

    public ModelManager() {
        customerList = new CustomerList();
        itemList = new ItemList();
        employeeList = new EmployeeList();
    }

    @Override
    public boolean logIn(String username, String password) throws RemoteException, NotBoundException {
        // TODO
        return false;
    }

    @Override
    public void logOut() {
        // TODO
    }

    @Override
    public Customer getCustomerByPassport(int passportNumber) throws RemoteException, NotBoundException {
        return customerList.getCustomerByPassport(passportNumber);
    }

    @Override
    public void addCustomer(Customer customer) throws RemoteException, NotBoundException {
        customerList.addCustomer(customer);
    }

    @Override
    public void removeCustomer(Customer customer) throws RemoteException, NotBoundException {
        customerList.removeCustomer(customer);
    }

    @Override
    public Item getItemById(int itemId) throws RemoteException, NotBoundException {
        return itemList.getItemById(itemId);
    }

    @Override
    public void addItem(Item item) throws RemoteException, NotBoundException {
        itemList.addItem(item);
    }

    @Override
    public void removeItem(Item item) throws RemoteException, NotBoundException {
        itemList.removeItem(item);
    }

    @Override
    public ArrayList<Employee> getEmployees() throws RemoteException, NotBoundException {
        return employeeList.getEmployees();
    }

    @Override
    public ArrayList<Employee> getEmployeesByType(String type) throws RemoteException, NotBoundException {
        return employeeList.getEmployeesByType(type);
    }

    @Override
    public Employee getEmployeeByUsername(String username) throws RemoteException, NotBoundException {
        return employeeList.getEmployeeByUsername(username);
    }

    @Override
    public void addEmployee(Employee employee) throws RemoteException, NotBoundException {
        employeeList.addEmployee(employee);
    }

    @Override
    public void removeEmployee(Employee employee) throws RemoteException, NotBoundException {
        employeeList.removeEmployee(employee);
    }

}