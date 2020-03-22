import java.util.ArrayList;

public class Exercises {

  public int findMe(int[] list, int target) {
    if (list == null || list.length == 0) {
      return -1;
    }
    for (int i = 0; i < list.length; i++) {
      if (list[i] == target) {
        return i;
      }
    }
    return -1;
  }

  public int findMe(ArrayList<String> list, String target) {
    if (list == null || list.size() == 0 || target == null) {
      return -1;
    }
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) == target) {
        return i;
      }
    }
    return -1;
  }

  public int findMeFaster(ArrayList<Integer> list, int target) {
    if (list == null || list.size() == 0) {
      return -1;
    }
    boolean isFound = false;
    int start = 0;
    int end = list.size();
    while (!isFound) {
      int midpoint = (start+end)/2;
      if (list.get(midpoint) == target) {
        return midpoint;
      } else if (list.get(midpoint) < target) {
        end = midpoint;
      } else if (list.get(midpoint) > target) {
        start = midpoint;
      }
    }
    return -1;
  }

  public int findMeFaster(String[] list, String target) {
    if (list == null || list.length == 0 || target == null) {
      return -1;
    }
    boolean isFound = false;
    int start = 0;
    int end = list.length;
    while (!isFound) {
      int midpoint = (start + end) / 2;
      if (list[midpoint].equals(target)) {
        return midpoint;
      } else if (list[midpoint].compareTo(target) < 0) {
        end = midpoint;
      } else if (list[midpoint].compareTo(target) > 0) {
        start = midpoint;
      }
    }
    return -1;
  }

  public int[] bubble(int[] list, boolean ascending) {
    
    if (list == null || list.length == 0) {
      return null;
    }

    int[] arr = list;

    if (ascending) {
      for (int i = 0; i < arr.length -1; i++) {
        for (int j = 0; j < arr.length -1 -i; j++) {
          if (arr[j] > arr[j+1]) { 
            int temp = arr[j]; 
            arr[j] = arr[j+1]; 
            arr[j+1] = temp; 
          } 
        }
      }
    } else if (!ascending) {
      for (int i = arr.length; i > 1; i--) {
        for (int j = arr.length; j > i - 1; j--) {
          if (arr[j] > arr[j - 1]) {
            int temp = arr[j];
            arr[j] = arr[j - 1];
            arr[j - 1] = temp;
          }
        }
      }
    }
    
    return arr;
  }

  public ArrayList<String> bubble(ArrayList<String> list, boolean ascending) {
    return null;
  }

  public ArrayList<Integer> insertion(ArrayList<Integer> list, boolean ascending) {
    return null;
  }

  public String[] insertion(String[] list, boolean ascending) {
    return null;
  }

  public int[] selection(int[] list, boolean ascending) {
    return null;
  }

  public ArrayList<String> selection(ArrayList<String> list, boolean ascending) {
    return null;
  }

  public ArrayList<Integer> merge(ArrayList<Integer> list, boolean ascending) {
    return null;
  }

  public String[] merge(String[] list, boolean ascending) {
    return null;
  }
}
