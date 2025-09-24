package application;

import entities.Customer;
import entities.Employee;
import entities.Product;
import entities.Order;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Criando produtos ---");
        Product p1 = new Product("Laptop", 1200.00, 5);
        Product p2 = new Product("Mouse", 25.50, 20);

        System.out.println("Produto 1: " + p1.toString());
        System.out.println("Produto 2: " + p2.toString());

        System.out.println("\nAdicionando 3 unidades de Laptop...");
        p1.addProducts(3);
        System.out.println("Novo estoque do Laptop: " + p1.toString());

        System.out.println("\nRemovendo 5 unidades de Mouse...");
        p2.removeProducts(5);
        System.out.println("Novo estoque do Mouse: " + p2.toString());

        System.out.println("\n--- Criando um cliente ---");
        Customer customer = new Customer("Rafael Ramos", "123.456.789-00", "rafael.ramoss145@gmail.com");
        System.out.println("Cliente criado: " + customer.getName() + " | Email: " + customer.getEmail());

        System.out.println("Atualizando email...");
        customer.updateEmail("dev.rafaelsmr");
        System.out.println("Novo email do cliente: " + customer.getEmail());

        System.out.println("\n--- Criando um pedido ---");
        Order order = new Order(101, "24/09/2025", customer);

        System.out.println("\nAdicionando produtos ao pedido...");
        order.addProduct(p1, 1);
        order.addProduct(p2, 2);

        double totalOrderValue = order.calculateTotal();
        System.out.println("Total do pedido: R$ " + String.format("%.2f", totalOrderValue));

        System.out.println("\n--- Criando um funcionário ---");
        Employee employee = new Employee("João Souza", 3000.00);
        System.out.println("Salário inicial de " + employee.getName() + ": R$ " + employee.getSalary());

        System.out.println("Aumentando o salário em 10%...");
        employee.increaseSalary(10.0);
        System.out.println("Novo salário de " + employee.getName() + ": R$ " + employee.getSalary());

        double bonus = employee.calculateBonus(5.0);
        System.out.println("Bônus de 5% para " + employee.getName() + " é: R$ " + String.format("%.2f", bonus));

        sc.close();
    }
}