class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()) return null;
        String encode = "";
        for(String s : strs) {
            encode += s + "<encode>";
        }
        return encode;
    }

    public List<String> decode(String str) {
        if(str == null) return new ArrayList<>();
        if(str.equals("<encode>")) return List.of("");
        List<String> decode = Arrays.asList(str.split("<encode>"));
        return decode;
    }
}
