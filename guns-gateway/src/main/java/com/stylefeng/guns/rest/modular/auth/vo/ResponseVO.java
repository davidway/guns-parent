package com.stylefeng.guns.rest.modular.auth.vo;

public class ResponseVO<M> {
    private int status;
    private String msg;
    //返回数据实体
    private M data;

    private ResponseVO(){}

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public M getData() {
        return data;
    }

    public void setData(M data) {
        this.data = data;
    }

    public static<M> ResponseVO success(M data){
        ResponseVO responseVO = new ResponseVO();
        responseVO.setData(data);
        responseVO.setStatus(0);

        return responseVO;
    }
    public static<M> ResponseVO serviceFail(String msg){
        ResponseVO responseVO = new ResponseVO();
        responseVO.setStatus(1);
        responseVO.setMsg(msg);

        return responseVO;
    }

    public static<M> ResponseVO systemFail(String msg){
        ResponseVO responseVO = new ResponseVO();
        responseVO.setStatus(999);
        responseVO.setMsg(msg);

        return responseVO;
    }
}
