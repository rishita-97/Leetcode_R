 class Codec {
        char delimiter = (char)258;

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        String result = "";
        for(String word : strs){
            result += (word + Character.toString(delimiter));
        }
        return result;
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        
        List<String> result = new ArrayList<>();
        String currentWord = "";
        int i = 0;
        while(i < s.length()){
            if(s.charAt(i) == delimiter){
                result.add(currentWord);
                currentWord = "";
            } else {
                currentWord += s.charAt(i);
            }
            i++;
        }
        return result;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));
