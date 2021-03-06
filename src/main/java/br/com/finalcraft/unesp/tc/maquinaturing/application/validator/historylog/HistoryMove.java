package br.com.finalcraft.unesp.tc.maquinaturing.application.validator.historylog;

import br.com.finalcraft.unesp.tc.maquinaturing.application.validator.data.PontoDeFita;
import br.com.finalcraft.unesp.tc.maquinaturing.application.validator.data.Vertice;

public class HistoryMove {

    PontoDeFita pontoDeFita;
    Vertice vertice;
    String currentExpression;
    public int pointer;

    private HistoryMove(){

    }

    public HistoryMove(PontoDeFita pontoDeFita, Vertice vertice, String currentExpression, int pointer) {
        this.pontoDeFita = pontoDeFita;
        this.vertice = vertice;
        this.currentExpression = currentExpression;
        this.pointer = pointer;
    }

    public HistoryMove(Vertice vertice, String currentExpression) {
        this.pontoDeFita = new PontoDeFita(' ', ' ', 'B');
        this.vertice = vertice;
        this.currentExpression = currentExpression;
        this.pointer = 0;
    }

    @Override
    public HistoryMove clone(){
        HistoryMove newHistoryMove = new HistoryMove();
        newHistoryMove.pontoDeFita = this.pontoDeFita;
        newHistoryMove.pointer = this.pointer;
        newHistoryMove.vertice = this.vertice;
        newHistoryMove.currentExpression = this.currentExpression;
        return newHistoryMove;
    }

    public String getCurrentExpression() {
        return currentExpression;
    }

    public PontoDeFita getPontoDeFita() {
        return pontoDeFita;
    }

    public Vertice getVertice() {
        return vertice;
    }
}
