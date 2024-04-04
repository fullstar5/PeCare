package team.gpt.pecare.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.List;

public class Response extends HashMap<String, Object> {

    private static String CODE = "statusCode";
    private static String BODY = "body";
    private static String MSG = "msg";
    private static String DATA = "data";
    private static String ROWS = "rows";

    private Response(int statusCode, String msg, Object data, List<?> rows) throws JsonProcessingException {
        HashMap<String, Object> body = new HashMap<>();
        body.put(MSG, msg);
        body.put(DATA, data);
        body.put(ROWS, rows);
        super.put(BODY, new ObjectMapper().writeValueAsString(body));
        super.put(CODE, statusCode);
    }


    public static Response success(String msg, Object data, List<?> rows) throws JsonProcessingException {
        return new Response(HttpStatusCode.SUCCESS, msg, data, rows);
    }

    public static Response error(String msg, Object data, List<?> rows) throws JsonProcessingException {
        return new Response(HttpStatusCode.ERROR, msg, data, rows);
    }


}
