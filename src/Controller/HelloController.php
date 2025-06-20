<?php

namespace App\Controller;

use Doctrine\ORM\EntityManagerInterface;
use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;
use Symfony\Component\HttpFoundation\JsonResponse;
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
     * @Route("/teste-1/{id}", methods={"GET"})
    */
    public function testeParametro(EntityManagerInterface $doctrine, Request $request, $id): Response
    {
        return new Response("<html><body><h1>teste com parametro: $id</h1></body></html>");
    }

    /**
     * @Route("/teste", methods={"GET"})
     */
    public function testeSemParametro(EntityManagerInterface $doctrine, Request $request): Response
    {
        return new Response("<html><body><h1>Teste sem parametro!</h1></body></html>");
    }

    /**
     * @Route("/teste/post", methods={"POST"})
     */
    public function testeParamsPost(EntityManagerInterface $doctrine, Request $request): Response
    {
        $data = $request->getContent();
        return new Response($data);
    }

    /**
     * @Route("/banco", methods={"GET"})
     */
    public function testar(EntityManagerInterface $em)
    {
        dd($em->getConnection()->connect());
    }

    /**
     * @Route("/phpinfo", methods={"GET"})
     */
    public function phpInfo()
    {
        phpinfo();
    }

}
