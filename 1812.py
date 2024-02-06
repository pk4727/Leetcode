# You are given coordinates, a string that represents the coordinates of a square of the chessboard(a->h*1->8).
# Return true if the square is white(1), and false if the square is black(0).

import numpy
class Solution(object):
    def squareIsWhite(self, coordinates):
        """
        :type coordinates: str
        :rtype: bool
        """
        n=numpy.array([[0,1,0,1,0,1,0,1],
        [1,0,1,0,1,0,1,0],
        [0,1,0,1,0,1,0,1],
        [1,0,1,0,1,0,1,0],
        [0,1,0,1,0,1,0,1],
        [1,0,1,0,1,0,1,0],
        [0,1,0,1,0,1,0,1],
        [1,0,1,0,1,0,1,0]])
        m={
            "1":1,"2":2,"3":3,"4":4,"5":5,"6":6,"7":7,"8":8,
            "a":1,"b":2,"c":3,"d":4,"e":5,"f":6,"g":7,"h":8
        }
        a,b=m[coordinates[0]]-1,m[coordinates[1]]-1
        if n[a][b]==1:
            return True
        else:
            return False
s=Solution()
print(s.squareIsWhite( "a1"))
print(s.squareIsWhite( "h3"))
print(s.squareIsWhite( "c7"))
print(s.squareIsWhite( "b2"))
print(s.squareIsWhite( "3c"))
