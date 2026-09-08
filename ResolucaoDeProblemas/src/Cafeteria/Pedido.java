package Cafeteria;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private final String cliente;
    private final List<Bebida> itens = new ArrayList<>();

    public Pedido(String cliente) {
        this.cliente = cliente;
    }

    public void adicionarItem(Bebida bebida) {
        itens.add(bebida);
    }

    public boolean estaVazio() {
        return itens.isEmpty();
    }

    public int quantidadeItens() {
        return itens.size();
    }

    public double getTotal() {
        double total = 0.0;
        for (Bebida bebida : itens) {
            total += bebida.getPreco();
        }
        return total;
    }

    public void imprimirComprovante() {
        System.out.println("==================================================");
        System.out.println("CAFETERIA - PEDIDO DE " + cliente.toUpperCase());
        System.out.println("==================================================");
        if (itens.isEmpty()) {
            System.out.println("Nenhum item no pedido.");
        } else {
            int numero = 1;
            for (Bebida bebida : itens) {
                System.out.printf("%d) %s%n", numero, bebida.getDescricao());
                System.out.printf("   R$ %.2f%n", bebida.getPreco());
                numero++;
            }
        }
        System.out.println("--------------------------------------------------");
        System.out.printf("TOTAL (%d item(ns)): R$ %.2f%n", itens.size(), getTotal());
        System.out.println("==================================================");
    }
}
