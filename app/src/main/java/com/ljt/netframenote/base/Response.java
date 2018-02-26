package com.ljt.netframenote.base;

import org.apache.http.HttpEntity;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.util.EncodingUtils;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Created by ${JT.L} on 2018/2/26.
 */

public class Response extends BasicHttpResponse {

    public byte[] rawData=new byte[0];
    public Response(StatusLine statusline) {
        super(statusline);
    }
    public Response(ProtocolVersion ver, int code, String reason) {
        super(ver, code, reason);
    }

    @Override
    public void setEntity(HttpEntity entity) {
        super.setEntity(entity);
        rawData=entityToBytes(getEntity());
    }

    public byte[] getRawData() {
        return rawData;
    }

    public int getStatusCode(){
        return getStatusLine().getStatusCode();
    }

  public String getMessage(){
      return getStatusLine().getReasonPhrase();
  }



    private byte[] entityToBytes(HttpEntity entity) {
        try {
            return EntityUtils.toByteArray(entity);
        }catch (IOException e){
            e.printStackTrace();
        }
        return new byte[0];
    }
}
