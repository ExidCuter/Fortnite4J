package xyz.dodo.entity;

public class SuccessCode {
    public enum Type {
        ok,
        error
    }
    Type responseType;
    String response;

    public SuccessCode(String response, Type responseType) {
        this.response = response;
        this.responseType = responseType;
    }

    public String getResponse() {
        return response;
    }

    public boolean isOk(){
        if (this.responseType == Type.ok)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return response;
    }
}
