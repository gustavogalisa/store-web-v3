package br.edu.ifpb.padroes.storewebv3.domain;

import br.edu.ifpb.padroes.storewebv3.visitor.Visitor;

public class Computer extends Product {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}