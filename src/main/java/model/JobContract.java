package model;

public enum JobContract {
    B2B (1), UoP(2);

    Integer form;

    JobContract(Integer form){
        this.form = form;
    }
}
