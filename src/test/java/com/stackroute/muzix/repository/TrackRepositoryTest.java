package com.stackroute.muzix.repository;

import com.stackroute.muzix.domain.Track;
import com.stackroute.muzix.repository.TrackRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@DataMongoTest
public class TrackRepositoryTest {

    @Autowired
    TrackRepository trackRepository;
    Track track;

    @Before
    public void setUp() {
        track = new Track();
        track.setTrackId(11);
        track.setTrackName("John");
    }

    @After
    public void tearDown(){

        trackRepository.deleteAll();
    }


    @Test
    public void testSaveTrack(){
        trackRepository.save(track);
        Track fetchTrack = trackRepository.findById(track.getTrackId()).get();
        Assert.assertEquals(11,fetchTrack.getTrackId());

    }

    @Test
    public void testSaveTrackFailure(){
        Track testTrack = new Track(30,"Hello","Adele");
        trackRepository.save(track);
        Track fetchUser = trackRepository.findById(track.getTrackId()).get();
        Assert.assertNotSame(testTrack,track);
    }

    @Test
    public void testGetAllTrack(){
        Track u = new Track(11,"SAD","sad song");
        Track u1 = new Track(30,"Hello","Adele");
        trackRepository.save(u);
        trackRepository.save(u1);

        List<Track> list = trackRepository.findAll();
        Assert.assertEquals("Hello",list.get(1).getTrackName());




    }


}