-- 9. The titles of movies directed by James Cameron (6 rows)
SELECT DISTINCT title, person_name
FROM movie
JOIN movie_actor ON movie.movie_id = movie_actor.movie_id
JOIN person ON movie.director_id = person.person_id
WHERE person_name = 'James Cameron'
