package sections.sec98_AlgorithmPatterns;

import java.util.*;

public class HashMapMethods {
    public static void main(String[] args) {
        // Frequency Map
        System.out.println("Frequency Map: " + buildFreq("aabcc"));  // {a=2, b=1, c=2}

        // First & Last Seen Index (Harflerin Son Olarak Göründüğü Indexler)
        System.out.println("First Seen Index: " + firstSeenIndex("abcab"));  // {a=0, b=1, c=2}
        System.out.println("Last Seen Index: " + lastSeenIndex("abcabc"));   // {a=3, b=4, c=5}

        // Grouping
        System.out.println(groupBySortedKey(List.of("eat", "tea", "tan", "nat", "ate")));  // {aet=[eat, tea, ate], ant=[tan, nat]}

        // Sliding Window + HashMap
        System.out.println(lengthOfLongestSubstring("abcabcbb"));  // 3 (abc)
        System.out.println(lengthOfLongestSubstring("bbbbbbbb"));  // 1
        System.out.println(maxSumSubArray(new int[]{2, 1, 5, 1, 3, 2}, 3));  // 9 (Yan yana olup en yüksek toplamı veren 3 elemanın (5 + 1 + 3) toplamı)
    }

    private static Map<Character, Integer> buildFreq(String text) {
        Map<Character, Integer> freq = new HashMap<>();

        for (char c : text.toCharArray()) {
            int currentCount = freq.getOrDefault(c, 0);
            freq.put(c, currentCount + 1);
            // freq.put(c, freq.getOrDefault(c, 0) + 1)  ---> Yukarıdaki yerine direkt böyle de olur:
            // freq.merge(c, 1, Integer::sum);           ---> getOrDefault yerine 2. yöntem:
        }

        return freq;
    }

    private static Map<Character, Integer> firstSeenIndex(String text) {
        Map<Character, Integer> firstIndex = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            firstIndex.putIfAbsent(c, i);
        }

        return firstIndex;
    }

    private static Map<Character, Integer> lastSeenIndex(String text) {
        Map<Character, Integer> lastIndex = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            lastIndex.put(c, i);
        }

        return lastIndex;
    }

    private static Map<String, List<String>> groupBySortedKey(List<String> words) {
        Map<String, List<String>> groups = new HashMap<>();
        System.out.println("Words: " + words);      // [eat, tea, tan, nat, ate]
        for (String w : words) {                    // w -> eat
            char[] chars = w.toCharArray();
            Arrays.sort(chars);
            System.out.println("Chars: " + Arrays.toString(chars));     // [a, e, t]
            String key = new String(chars);
            System.out.println("Key: " + key);                          // aet
            groups.computeIfAbsent(key, k -> new ArrayList<>()).add(w);
        }

        return groups;
    }

    // Sliding Window
    private static int lengthOfLongestSubstring(String text) {
        Map<Character, Integer> lastIndex = new HashMap<>();    // Her karakterin son görüldüğü pozisyon indeksini tutan HashMap

        int left = 0;
        int best = 0;

        for (int right = 0; right < text.length(); right++) {
            char c = text.charAt(right);

            Integer prev = lastIndex.get(c);

            // prev boş değilse yani character daha önce görüldüyse left güncellenir. Karakterin son görüldüğü yerden bir sonraki pozisyona atlanır
            if (prev != null) {
                left = Math.max(left, prev + 1);
            }

            lastIndex.put(c, right);
            best = Math.max(best, right - left + 1);
        }

        return best;
    }

    private static int maxSumSubArray(int[] arr, int k) {
        int maxSum = 0;
        int windowSum = 0;

        // İlk pencere toplamı (2 + 1 + 5 = 8)
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        maxSum = windowSum;

        // Baştan sona pencereyi kaydırma
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];   // windowSum = windowSum + arr[i] - arr[i - k]  --->  Pencereye bir yeni eleman ekleyip, bir eleman çıkarır. Yani sağa kayar
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

}

/*
    - Counting:
    map.put(k, map.getOrDefault(k, 0) + 1);
    veya
    map.merge(k, 1, Integer::sum);

    - First Seen & Last Seen
    map.putIfAbsent(k, i);
    map.put(k, i);

    - Grouping:
    map.computeIfAbsent(k, t -> new ArrayList<>()).add(v);

    - Prefix sum:
    ans += map.getOrDefault(prefix - k, 0);
    map.put(prefix, map.getOrDefault(prefix, 0) + 1);

    - Iterate:
    for (Map.Entry<K, V> e : map.entrySet()) { ... }
*/
/*
    1) Frequency Map Algoritma Senaryoları
    - En çok tekrar eden eleman
    - Anagram kontrolü
    - İlk unique karakter
    - “K adet tekrar eden” gibi sorular

    getOrDefault(key, default):  Key varsa value döner, yoksa defaultValue döner
    merge(key, 1, Integer::sum): Key yoksa value'yu direkt yazar, varsa remappingFunction(oldValue, value) ile yeni value hesaplar ve yazar
*/
/*
    2) First Seen / Last Seen Index
    - Longest substring without repeating
    - Tekrarlı elemanın mesafesi
    - Partitioning (son görülen index)

    NOTE: İlk görülen index için "putIfAbsent", son görülen index için "put" kullanılır

    putIfAbsent(key, value): Key yoksa ekler, varsa dokunmaz
    put(k, i):               Map, her seferinde map son görülen key'e göre indexi günceller
*/
/*
    3) Grouping
    - Anagram gruplama
    - Aynı kategoriye göre grupla

    computeIfAbsent: Key yoksa oluşturur, varsa mevcut listeyi kullan
*/
/*
    4) Sliding Window + HashMap
    - Longest substring without repeating characters
    - Minimum window substring (daha ileri)
    - “Kısıtlı pencere” problemleri
*/