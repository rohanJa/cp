/**
 *    author:  tourist
 *    created: 08.06.2019 17:16:06       
**/
#include <bits/stdc++.h>

using namespace std;

string to_string(string s) {
  return '"' + s + '"';
}

string to_string(const char* s) {
  return to_string((string) s);
}

string to_string(bool b) {
  return (b ? "true" : "false");
}

template <typename A, typename B>
string to_string(pair<A, B> p) {
  return "(" + to_string(p.first) + ", " + to_string(p.second) + ")";
}

template <typename A>
string to_string(A v) {
  bool first = true;
  string res = "{";
  for (const auto &x : v) {
    if (!first) {
      res += ", ";
    }
    first = false;
    res += to_string(x);
  }
  res += "}";
  return res;
}

void debug_out() { cerr << endl; }

template <typename Head, typename... Tail>
void debug_out(Head H, Tail... T) {
  cerr << " " << to_string(H);
  debug_out(T...);
}

#ifdef LOCAL
#define debug(...) cerr << "[" << #__VA_ARGS__ << "]:", debug_out(__VA_ARGS__)
#else
#define debug(...) 42
#endif

const long long inf = (long long) 1e12;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(0);
  const int N = 100;
  vector<int> grundy(N + 1);
  for (int i = 1; i <= N; i++) {
    set<int> s;
    for (int x = 0; x < i; x++) {
      s.insert(grundy[x] ^ grundy[i - 1 - x]);
    }
    for (int x = 0; x < i - 1; x++) {
      s.insert(grundy[x] ^ grundy[i - 2 - x]);
    }
    while (s.count(grundy[i])) {
      ++grundy[i];
    }
  }
  int tt, w;
  cin >> tt >> w;
  for (int qq = 1; qq <= tt; qq++) {
    vector<long long> cuts;
    cuts.push_back(0);
    cuts.push_back(inf);
    while (true) {
      long long pp;
      cin >> pp;
      if (pp == -1) {
        return 0;
      }
      if (pp < 0) {
        break;
      }
      cuts.push_back(pp - 1);
      cuts.push_back(pp - 1 + inf / N);
      sort(cuts.begin(), cuts.end());
      vector<pair<long long, long long>> segs;
      for (int i = 0; i < (int) cuts.size(); i += 2) {
        if (cuts[i + 1] - cuts[i] >= inf / N) {
          segs.emplace_back(cuts[i + 1] - cuts[i], cuts[i] + 1);
        }
      }
      int gr = 0;
      for (auto& p : segs) {
        gr ^= grundy[p.first / (inf / N)];
      }
      long long mv = -1;
      if (gr != 0) {
        for (auto& p : segs) {
          int len = (int) (p.first / (inf / N));
          for (int x = 0; x < len; x++) {
            if ((gr ^ grundy[len] ^ grundy[x] ^ grundy[len - 1 - x]) == 0) {
              mv = p.second + x * (inf / N);
              break;
            }
          }
          if (mv != -1) {
            break;
          }
          for (int x = 0; x < len - 1; x++) {
            if ((gr ^ grundy[len] ^ grundy[x] ^ grundy[len - 2 - x]) == 0) {
              long long rm = p.first % (inf / N);
              rm += ((inf / N) - rm) / 2;
              mv = p.second + x * (inf / N) + rm;
              break;
            }
          }
          if (mv != -1) {
            break;
          }
        }
      }
      if (mv == -1) {
        mv = segs[0].second;
      }
      cout << mv << endl;
      cuts.push_back(mv - 1);
      cuts.push_back(mv - 1 + inf / N);
    }
  }
  return 0;
}
