package com.company.model;

public class STAPEL<T> {
    private Stapelung top;

    public T peek(){
        if(!isEmpty()){
            return top.getContent();
        }
        return null;
    }
    public void push(T value){
        if(value != null){
            top = new Stapelung(value,top);
        }
    }
    public void pop(){
        if(!isEmpty()){
            top = top.next;
        }
    }
    public boolean isEmpty(){
        return top == null;
    }
    private class Stapelung {
        private T content;
        private Stapelung next;
        public Stapelung(T value,Stapelung next){
            content = value;
            this.next = next;
        }
        public T getContent(){
            return content;
        }
    }
}
