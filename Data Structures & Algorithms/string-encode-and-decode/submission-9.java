class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()) return null;
        StringBuilder encode = new StringBuilder();
        for(String s : strs) {
            encode.append(s).append("<encode>");
        }
        return encode.toString();
    }

    public List<String> decode(String str) {
        if(str == null) return new ArrayList<>();
        if(str.equals("<encode>")) return List.of("");
        List<String> decode = Arrays.asList(str.split("<encode>"));
        return decode;
    }
}
