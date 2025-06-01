class WordsContainChar(object):
    def findWordsContaining(self, words, x):
        arr = []
        n = len(words)
        for i in range(0,n):
            if x in words[i]:
                arr.append(i)
        return arr
words = input().split()
x = input()
s = WordsContainChar()
print(s.findWordsContaining(words,x))     