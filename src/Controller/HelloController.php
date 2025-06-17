<?php

namespace App\Controller;

use Doctrine\ORM\EntityManagerInterface;
use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;
use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\Routing\Annotation\Route;


/**
 * Class HelloController
 *
 * @author Fernando Cristen <fernando.cristen@panoramasistemas.com>
 */
class HelloController extends AbstractController
{

    /**
     * @Route("/teste/{id}", methods={"GET"})
    */
    public function index(EntityManagerInterface $doctrine, Request $request, $id): Response
    {
        return new Response("<html><body><h1>Olá, Symfony está funcionando!</h1></body></html>");
    }
}
