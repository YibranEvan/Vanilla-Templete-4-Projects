-- 15. The title of the movie and the name of director for movies where the director was also an actor in the same movie (73 rows)
SELECT DISTINCT title, person_name
FROM person 
JOIN movie_actor ON movie_actor.actor_id = person.person_id
JOIN movie ON movie_actor.movie_id = movie.movie_id
WHERE director_id = actor_id
